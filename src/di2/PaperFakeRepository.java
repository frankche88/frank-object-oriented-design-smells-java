package di2;

import java.util.ArrayList;
import java.util.List;

public class PaperFakeRepository {
    public List<Paper> getPapers() {
        List<Paper> papers = new ArrayList<Paper>();
        papers.add(new Paper("Paper1 from Fake"));
        papers.add(new Paper("Paper2 from Fake"));
        papers.add(new Paper("Paper3 from Fake"));
        return papers;
    }
}