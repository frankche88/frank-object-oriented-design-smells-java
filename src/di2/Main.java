package di2;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            PaperApplication paperApp = new PaperApplication(PaperRepositoryType.Fake);
            List<Paper> papers = paperApp.getPapers();
            if (papers.size() > 0) {
                for (Paper paperItem : papers) {
                    System.out.println(paperItem.getTitle());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}