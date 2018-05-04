package di;

import java.util.*;

public class PaperApplication {
    private PaperSQLServerRepository paperSQLServerRepository = new PaperSQLServerRepository();
    
    public PaperApplication() {
    }

    public List<Paper> getPapers() {
        return this.paperSQLServerRepository.getPapers();
    }
}
