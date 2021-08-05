//CC03 Version 8
import static org.junit.Assert.*;
import org.junit.Test;

public class DocumentTest extends FormatTester
{
    public static final String CLASSNAME = "Document";

    public DocumentTest() {
        super(CLASSNAME, false);
    }

    private void testClassDefinition(){
        String[] instanceVars = {"int size","String language", "String authors","String uri","double rank"};
        assertTrue("Instance variables should be private with correct name and type.", instanceVariablesArePrivate(instanceVars));

    }

    @Test
    public void test_Constructor_Default()
    {
	  testClassDefinition();
	Document d = new Document();
	assertEquals(" Size ",0,d.getSize());
	assertEquals(" Authors ","",d.getAuthors());
      assertEquals(" Uri ","",d.getUri());
	assertEquals(" Language ","English",d.getLanguage());
	assertEquals(" Rddank ",0.0,d.getRank(),0.0001);
    }

    @Test
    public void test_Constructor_All()
    {
	    testClassDefinition();
        Document d = new Document(1024,"Frensh","Michel Leblanc","www.domain.com/index.html",4);
	  assertEquals(" Size ",1024,d.getSize());
        assertEquals(" Authors ","Michel Leblanc",d.getAuthors());
        assertEquals(" Uri ","www.domain.com/index.html",d.getUri());
        assertEquals(" Language ","Frensh",d.getLanguage());
	assertEquals(" Rank ",1.0,d.getRank(),0.0001);
    }
  
    @Test
    public void test_Constructor_AllExceptLang()
    {
	    testClassDefinition();
        Document d = new Document(2048,"English","Adam Smith","www.domain.com/index.html",-1);
	assertEquals(" Size ",2048,d.getSize());
        assertEquals(" Authors ","Adam Smith",d.getAuthors());
        assertEquals(" Uri ","www.domain.com/index.html",d.getUri());
        assertEquals(" Language ","English",d.getLanguage());
	assertEquals(" Rank ",0.0,d.getRank(),0.0001);
    }
  
    @Test
    public void test_Constructor_negSize()
    {
	    testClassDefinition();
        Document d = new Document(-4096,"Spanish","Senior Garcia","www.domain.com/index.html",0.5);
        assertEquals(" Size  ",0,d.getSize());
        assertEquals(" Authors ","Senior Garcia",d.getAuthors());
        assertEquals(" Uri ","www.domain.com/index.html",d.getUri());
        assertEquals(" Language ","Spanish",d.getLanguage());
	   assertEquals(" Rank ",0.5,d.getRank(),0.0001);

    }
  
    @Test
    public void test_set_negSize()
    {
	    testClassDefinition();
        Document d = new Document(8192,"Authors","www.domain.com/index.html");
	d.setSize(-1542);	
        assertEquals(" Size ",8192,d.getSize());
    }
    
    @Test
    public void test_set_Authors()
    {
	    testClassDefinition();
        Document d = new Document(512,"Amar Hamdan","www.domain.com/index.html");
        d.setAuthors("Omair Maimoon");
        assertEquals(" Authors ","Omair Maimoon",d.getAuthors());
    }
    
    @Test
    public void test_set_Language()
    {
	    testClassDefinition();
        Document d = new Document(256,"Jose Swares","www.domain.com/index.html");
        d.setLanguage("Portuguese");
        assertEquals(" Language ","Portuguese",d.getLanguage());
    }

    @Test
    public void test_set_negRank()
    {
	    testClassDefinition();
        Document d = new Document(256,"Jose Swares","www.domain.com/index.html");
        d.setRank(-1);
        assertEquals(" Rank ",0.0,d.getRank(),0.0001);
    }

    @Test
    public void test_set_Rank5()
    {
	    testClassDefinition();
        Document d = new Document(256,"Jose Swares","www.domain.com/index.html");
        d.setRank(5);
        assertEquals(" Rank ",1.0,d.getRank(),0.0001);
    }

    @Test
    public void test_set_RankPoint3()
    {
	    testClassDefinition();
        Document d = new Document(256,"Jose Swares","www.domain.com/index.html");
        d.setRank(0.3);
        assertEquals(" Rank ",0.3,d.getRank(),0.0001);
    }


}
