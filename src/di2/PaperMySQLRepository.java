package di2;

import java.util.ArrayList;
import java.util.List;

public class PaperMySQLRepository {
    public List<Paper> getPapers() {
        List<Paper> papers = new ArrayList<Paper>();
        papers.add(new Paper("Paper1 from MySQL Server"));
        papers.add(new Paper("Paper2 from MySQL Server"));
        papers.add(new Paper("Paper3 from MySQL Server"));
        return papers;
    }
}