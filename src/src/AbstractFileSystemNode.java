package src;

public class AbstractFileSystemNode implements FileSystemNode{
    public String name;
    public String path;

    @Override
    public final String returnParent(){
        return super.toString();
    }
    @Override
    public String returnName()
    {
        return this.name;
    };
    @Override
    public final String returnPath()
    {
        return this.path;
    }
}
