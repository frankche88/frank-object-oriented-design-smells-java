package di2;

import java.util.*;

public class PaperApplication {
    private PaperMySQLRepository paperMySQLRepository;
    private PaperSQLServerRepository paperSQLServerRepository;
    private PaperCSVRepository paperCSVRepository;
    private PaperFakeRepository paperFakeRepository;

    public PaperApplication(PaperRepositoryType repositoryType) {
        switch (repositoryType) {
            case MySQL :
                this.paperMySQLRepository = new PaperMySQLRepository();
                break;
            case SQLServer :
                this.paperSQLServerRepository = new PaperSQLServerRepository();
                break;
            case CSV :
                this.paperCSVRepository = new PaperCSVRepository();
                break;
            case Fake :
                this.paperFakeRepository = new PaperFakeRepository();
                break;
            default :
                this.paperMySQLRepository = new PaperMySQLRepository();
                break;
        }
    }

    public List<Paper> getPapers() {
        if (this.paperMySQLRepository != null) {
            return this.paperMySQLRepository.getPapers();
        }
        if (this.paperSQLServerRepository != null) {
            return this.paperSQLServerRepository.getPapers();
        }
        if (this.paperCSVRepository != null) {
            return this.paperCSVRepository.getPapers();
        }
        if (this.paperFakeRepository != null) {
            return this.paperFakeRepository.getPapers();
        }
        return new ArrayList<Paper>();
    }
}
