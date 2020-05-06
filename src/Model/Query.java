package Model;

import java.util.HashMap;

public class Query {
    private String queryID;
    private HashMap<String,Integer> queryMap;
    private int numOfEntities;//????
    private int numOfWordsinQuery;//???

    public Query(Document queryDoc) {
        this.queryID = queryDoc.getDocName();
        this.queryMap= queryDoc.getDocMap();
        this.numOfEntities= queryDoc.getNumOfEntities();
        this.numOfWordsinQuery= queryDoc.getNumOfWordsinDoc();
    }
}
