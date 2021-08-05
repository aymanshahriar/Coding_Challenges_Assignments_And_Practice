//CC03 Version 8
import static org.junit.Assert.*;
import org.junit.Test;

public class WebPageTest extends FormatTester
{
	public static final String CLASSNAME = "WebPage";

    public WebPageTest() {
        super(CLASSNAME, false);
    }

   private void testClassDefinition(){
        String[] instanceVars = {"int visits"};
        assertTrue("Instance variables should be private with correct name and type.", instanceVariablesArePrivate(instanceVars));

    }


    @Test
    public void test_Constructor_0Visits_InitialRank4()
    {
	    testClassDefinition();
	WebPage p = new WebPage(1024,"English","John Doe","www.domain.com/index.html",0,4.0);

	assertEquals(" Visits: ",1,p.getVisits());
	assertEquals(" New Rank: ",0.0,p.getRank(),0.0001);	
    }

    @Test
    public void test_Constructor_negVisits_negInitialRank()
    {
	    testClassDefinition();
        WebPage p = new WebPage(2048,"English","Bob William","www.domain.com/index.html",-1,-1.0);
 	   assertEquals(" Visits: ",1,p.getVisits());
        assertEquals(" New Rank: ",0.0,p.getRank(),0.0001);
    }
  
    @Test
    public void test_Constructor_10Visits_InitialRankPoint5()
    {
	    testClassDefinition();
        WebPage p = new WebPage(-10,"English","Bob William","www.domain.com/index.html",10,0.5);
        assertEquals(" visits:",10,p.getVisits());        
    }
  
    @Test
    public void test_Constructor_copy()
    {
	    testClassDefinition();
        WebPage p = new WebPage(-10,"English","Bob William","www.domain.com/index.html",10,0.90);
	   WebPage q = new WebPage(p);
        assertEquals(" Visits: ",10,q.getVisits());
    }
  
    @Test
    public void test_setVisits_100()
    {
	    testClassDefinition();
        WebPage p = new WebPage(2048,"English","Bob William","www.domain.com/index.html",-1,-1.0);
	p.setVisits(100);
        assertEquals(" Visits: ",100,p.getVisits());
    }

    @Test
    public void test_setVisits_neg1()
    {
	    testClassDefinition();
        WebPage p = new WebPage(4096,"English","Bob William","www.domain.com/index.html",1,1.0);
	   p.setVisits(-1);
        assertEquals(" Visits: ",1,p.getVisits());
    }
    
    @Test
    public void test_setRank_5()
    {
	    testClassDefinition();
        WebPage p = new WebPage(1024,"English","Bob William","www.domain.com/index.html",0,1.0);
        p.setRank(5.0);
        assertEquals(" Rank when visits = 1 ",0.0,p.getRank(),0.0001);
    }

    @Test
    public void test_setRank_neg3()
    {
	    testClassDefinition();
        WebPage p = new WebPage(512,"English","Bob William","www.domain.com/index.html",100,1.0);
        p.setRank(-3);
        assertEquals(" Rank when visits = 100: ",0.99,p.getRank(),0.0001);
    }
    
    @Test
    public void test_setVisits_lessVisits()
    {
	    testClassDefinition();
        WebPage p = new WebPage(2048,"English","Bob William","www.domain.com/index.html",10,1f);
        p.setVisits(1);
        assertEquals(" Visits: ",10,p.getVisits());
    }

}
