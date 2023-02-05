package personal.model;


public class RepositoryFile extends RepositoryImpl {
    public RepositoryFile(FileOperation fileOperation) {
        super(fileOperation, new UserMapper());
    }

    
}
