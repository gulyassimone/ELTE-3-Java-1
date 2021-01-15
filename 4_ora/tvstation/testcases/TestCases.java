package tvstation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TvTest {
    @Test
    public void testNoContent() {
        new TvStation("tv1");
        new Company("c1");
        new Movie("m1");
        new Movie("m1", 1);
    }

    @Test
    public void testMany() {
        Movie m1 = new Movie("m1");
        Company c1 = new Company("c1", m1);
        new Company("c1", m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1, m1);
        new Company("c1", m1, m1, m1, m1, m1, m1, m1);
        new Company("c1", m1, m1, m1, m1, m1, m1);
        new Company("c1", m1, m1, m1, m1, m1);
        new Company("c1", m1, m1, m1, m1);
        new Company("c1", m1, m1, m1);
        new Company("c1", m1, m1);
        new Company("c1", m1);

        new TvStation("tv1", c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1, c1);
        new TvStation("tv1", c1, c1, c1, c1, c1, c1, c1);
        new TvStation("tv1", c1, c1, c1, c1, c1, c1);
        new TvStation("tv1", c1, c1, c1, c1, c1);
        new TvStation("tv1", c1, c1, c1, c1);
        new TvStation("tv1", c1, c1, c1);
        new TvStation("tv1", c1, c1);
        new TvStation("tv1", c1);
    }

    @Test
    public void testSimpleMovie() {
        Movie m1 = new Movie("m1");
        Company c1 = new Company("c1", m1);
        TvStation t1 = new TvStation("tv1", c1);

        assertEquals("(no movie)", t1.getMovieTitle(0));
        assertEquals("(no movie)", t1.getMovieTitle(1));
        assertEquals("(no movie)", t1.getMovieTitle(23));

        t1.makeMovie(0, 0);
        assertEquals("m1", t1.getMovieTitle(0));

        Movie out1 = c1.createMovie();
        Movie out2 = c1.createMovie();
        Movie out3 = c1.createMovie();
        assertTrue(m1 == out1);
        assertTrue(m1 == out2);
        assertTrue(m1 == out3);
    }

    @Test
    public void testLongerMovie() {
        Movie m3 = new Movie("m3", 3);
        Company c1 = new Company("c1", m3);
        TvStation t1 = new TvStation("tv1", c1);

        t1.makeMovie(0, 0);
        assertEquals("m3", t1.getMovieTitle(0));
        assertEquals("m3", t1.getMovieTitle(1));
        assertEquals("m3", t1.getMovieTitle(2));
        assertEquals("(no movie)", t1.getMovieTitle(3));
    }

    @Test
    public void testTooLateMovie() {
        Movie m1 = new Movie("m1");
        Movie m2 = new Movie("m2", 2);
        Company c1 = new Company("c1", m2, m1);
        TvStation t1 = new TvStation("tv1", c1);

        assertFalse(t1.makeMovie(0, 23));
        assertTrue(t1.makeMovie(0, 23));
    }

    @Test
    public void testLongMovies() {
        Movie m12a = new Movie("m12a", 12);
        Movie m12b = new Movie("m12b", 12);
        Company c1 = new Company("c1", m12a);
        Company c2 = new Company("c2", m12b);
        TvStation t1 = new TvStation("tv1", c1, c2);

        assertTrue(t1.makeMovie("c1", 0));
        assertTrue(t1.makeMovie("c2", 12));

        assertEquals("m12a", t1.getMovieTitle(0));
        assertEquals("m12a", t1.getMovieTitle(11));
        assertEquals("m12b", t1.getMovieTitle(12));
        assertEquals("m12b", t1.getMovieTitle(23));
    }

    // segedfuggveny, nem teszteset
    private TvStation makeTestTvStation() {
        Movie m1 = new Movie("m1");
        Movie m2 = new Movie("m2", 2);
        Movie m3 = new RatedMovie("m3", 3, 25);
        Movie m4 = new RatedMovie("m4", 4, 75);
        Company c1 = new Company("c1", m1, m2);
        Company c2 = new Company("c2", m3, m4);
        return new TvStation("tv1", c1, c2);
    }

    @Test
    public void testText() {
        assertEquals("long[24h+]", new Movie("long", 24) + "");
        assertEquals("longer[24h+]", new Movie("longer", 100) + "");
        assertEquals("longest[24h+]", new Movie("longest", Integer.MAX_VALUE) + "");

        TvStation t1 = makeTestTvStation();

        assertEquals("tv1()", t1 + "");
        boolean ok1 = t1.makeMovie(0, 0);
        assertEquals("tv1(0:00-m1[1h]|)", t1 + "");
        assertTrue(ok1);

        boolean ok2 = t1.makeMovie(1, 1);
        assertEquals("tv1(0:00-m1[1h]|1:00-m3[1h](25%)|)", t1 + "");
        assertTrue(ok2);

        boolean ok3 = t1.makeMovie(1, 0);
        assertEquals("tv1(0:00-m4[1h](75%)|1:00-m3[1h](25%)|)", t1 + "");
        assertTrue(ok3);

        boolean ok4 = t1.makeMovie(1, 0);
        assertEquals("tv1(0:00-m4[1h](75%)|1:00-m3[1h](25%)|)", t1 + "");
        assertFalse(ok4);
    }


    @Test
    public void testEquality() {
        Movie m1 = new Movie("m1");
        Movie m2 = new Movie("m2", 2);
        Movie m2b = new Movie("m2", 1234);

        Company c1 = new Company("c", m1);
        Company c2 = new Company("abcde", m1);
        Company c3 = new Company("c", m1, m1);
        assertEquals(c1, c1);
        assertEquals(c1, c2);
        assertEquals(c2, c1);
        assertEquals(c1, c3);
        assertEquals(c3, c1);

        Company c4 = new Company("c", m2);
        Company c5 = new Company("c", m2b);
        assertEquals(c4, c5);
        assertEquals(c5, c4);

        Company c6 = new Company("c", m1, m2);
        Company c7 = new Company("c", m2, m1);
        assertEquals(c6, c7);
        assertEquals(c7, c6);
    }

    @Test
    public void testRated() {
        Movie m1 = new Movie("m1");
        Movie rm100 = new RatedMovie("rm1", 100);
        Movie rm50 = new RatedMovie("rm1", 50);

        assertTrue(m1.canReplace(m1));
        assertFalse(rm100.canReplace(rm100));
        assertFalse(rm50.canReplace(rm50));

        assertTrue(m1.canReplace(rm100));
        assertTrue(m1.canReplace(rm50));
        assertTrue(rm100.canReplace(m1));
        assertTrue(rm100.canReplace(rm50));
        assertTrue(rm50.canReplace(m1));
        assertFalse(rm50.canReplace(rm100));
    }

    @Test
    public void testInvalidFile() {
        assertEquals(0, new TvStation("").processMoviesFromFile("invalid_filename.txt"));
    }

    @Test
    public void testProcessMoviesFromFile() {
        TvStation t1 = makeTestTvStation();

        int successes1 = t1.processMoviesFromFile("movies1.txt");
        assertEquals(5, successes1);
        assertEquals("tv1(0:00-m1[1h]|2:00-m4[1h](75%)|10:00-m3[1h](25%)|13:00-m2[2h]|14:00-m2[2h]|21:00-m4[1h](75%)|)", t1 + "");

        int successes2 = t1.processMoviesFromFile("movies1.txt");
        assertEquals(3, successes2);
        assertEquals("tv1(0:00-m2[2h]|1:00-m2[2h]|2:00-m4[1h](75%)|10:00-m4[1h](75%)|13:00-m2[2h]|14:00-m2[2h]|21:00-m4[1h](75%)|)", t1 + "");
    }
}
