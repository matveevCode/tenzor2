package src;

public class File extends AbstractFileSystemNode {
    public String exp;
    File(String name, String exp, AbstractFileSystemNode folder){
        this.name = name;
        this.exp = exp;
        this.path = folder.path+"/"+name+"."+exp;
    }
    public String returnExp(){
        return exp;
    }
}
