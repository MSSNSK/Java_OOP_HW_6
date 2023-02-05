package personal.model;

public class NewRepositoryFile extends RepositoryImpl{
    public NewRepositoryFile(FileOperation fileOperation) {
        super(fileOperation, new NewUserMapper());
    }
}
