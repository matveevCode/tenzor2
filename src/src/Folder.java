package src;

public class Folder extends AbstractFileSystemNode{
    public String childs="";
    static String rootpath;
    Folder(String name, AbstractFileSystemNode... files) {
        this.name = name;
        if (files.length==0) {
            this.rootpath = this.name;
            this.path = "/" + name;
        }
        else
            this.path = "/"+rootpath+"/"+name;
        for (int i = 0; i < files.length; i++){
            this.childs+=" "+files[i].name;
            if (files[i] instanceof Folder)
                files[i].path = this.path+files[i].path;
        }

    }
    public String returnChilds(){
        return this.childs;
    }
}
