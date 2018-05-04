package di;

import java.util.ArrayList;
import java.util.List;

public class PaperSQLServerRepository {
    public List<Paper> getPapers() {
        List<Paper> papers = new ArrayList<Paper>();
        papers.add(new Paper("Paper1 from SQL Server"));
        papers.add(new Paper("Paper2 from SQL Server"));
        papers.add(new Paper("Paper3 from SQL Server"));
        return papers;
    }
}