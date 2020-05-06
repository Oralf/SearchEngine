package Model;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;

public class Test {

    public static void main(String[] args) throws IOException {

        HashMap<String, Double> a= new HashMap<>();
        a.put("avi",1.0);
        a.put("or",1.0);
        a.put("tal",1.0);
        a.put("mor",1.0);
        a.put("gal",1.0);
        a.put("bar",1.0);

        a.put("avi",0.2);
        a.put("mor",0.2);

        System.out.println(a.toString());
        /*
        String desc= "<num> Number: 351 \n" +
                "<title> Falkland petroleum exploration \n" +
                "\n" +
                "<desc> Description: \n" +
                "What information is available on petroleum exploration in \n" +
                "the South Atlantic near the Falkland Islands?\n" +
                "\n" +
                "<narr> Narrative: \n" +
                "Any document discussing petroleum exploration in the\n" +
                "South Atlantic near the Falkland Islands is considered\n" +
                "relevant.  Documents discussing petroleum exploration in \n" +
                "continental South America are not relevant.\n";

        String queryText =StringUtils.substring(desc,StringUtils.indexOf(desc, "<desc>") , StringUtils.indexOf(desc, "<narr>"));
        queryText=StringUtils.substring(queryText,StringUtils.indexOf(queryText,":")+2);
        queryText=StringUtils.strip(queryText," ");
        System.out.println(queryText);
/*
        String str="<num> Number: 351 \n" +
                "<title> Falkland petroleum exploration \n" +
                "\n" +
                "<desc> Description: \n" +
                "What information is available on petroleum exploration in \n" +
                "the South Atlantic near the Falkland Islands?\n" +
                "\n" +
                "<narr> Narrative: \n" +
                "Any document discussing petroleum exploration in the\n" +
                "South Atlantic near the Falkland Islands is considered\n" +
                "relevant.  Documents discussing petroleum exploration in \n" +
                "continental South America are not relevant.\n";

        String ans= StringUtils.substring(str,StringUtils.indexOf(str,"Number:"),StringUtils.indexOf(str,"<title>"));
        System.out.println(StringUtils.indexOf(str,"Number: "));
        System.out.println(StringUtils.indexOf(str,"<title>"));
        System.out.println(ans);
        ans=StringUtils.substring(ans,StringUtils.indexOf(ans," "));
*/

/*
        Searcher sh= new Searcher(true,true,false,"",new Indexer());
        sh.searchSingleQuery("USA home","123");
*//*
        File source= new File("d:\\documents\\users\\oralf\\Downloads\\text.txt");
        File dest=new File("d:\\documents\\users\\oralf\\Pictures\\text3.txt");
       // dest.createNewFile();
        Files.copy(source.toPath(),dest.toPath());
        /*
        HashSet<String> ans1= new HashSet<>();
        ans1.add("doc1");
        ans1.add("doc2");
        ans1.add("doc3");
        ans1.add("doc4");
        ans1.add("doc8");
        HashSet<String> ans2= new HashSet<>();
        ans2.add("doc5");
        ans2.add("doc6");
        ans2.add("doc7");
        ans2.add("doc8");
        ans2.add("doc9");
        sh.writeQueryResultsToFile("C:\\Users\\avitalze\\Downloads","100",ans1);
        sh.writeQueryResultsToFile("C:\\Users\\avitalze\\Downloads","101",ans2);
        */
        }
    }


