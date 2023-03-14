import java.util.Vector;

public class Folder {
    private String folderName = "";
    private Folder parentFolder = null;
    private final Vector<Folder> subFolders = new Vector<>();
    private final Vector<File> files = new Vector<>();

    static boolean initPrint = false;

    Folder() {
    }

    Folder(String folder_name) {
        folderName = folder_name;
    }

    public void SetFolderName(String folder_name) {
        folderName = folder_name;
    }

    public void AddFolder(Folder new_folder) {
        new_folder.parentFolder = this;
        subFolders.add(new_folder);
    }

    public void AddFile(File new_file) {
        files.add(new_file);
    }

    public void Delete(Folder folder) {
        subFolders.remove(folder);
    }

    public void Delete(File file) {
        files.remove(file);
    }

    public void PrintFileStructure() {
        System.out.println(folderName);
        PrintFileStructureStart();
    }
    private void PrintFileStructureStart() {
        for(Folder f : subFolders) {
            StringBuilder indentation = new StringBuilder();
            indentation.append("  ");
            Folder tmp_folder = parentFolder;

            while (tmp_folder != null) {
                indentation.append("  ");
                tmp_folder = tmp_folder.parentFolder;
            }

            System.out.println(indentation + "+" + f.folderName);

            f.PrintFileStructureStart();
        }

        for(File f : files) {
            StringBuilder indentation = new StringBuilder();
            indentation.append("  ");
            Folder tmp_folder = parentFolder;

            while (tmp_folder != null) {
                indentation.append("  ");
                tmp_folder = tmp_folder.parentFolder;
            }

            System.out.println(indentation + "+" + f.GetFileName());
        }
    }



}
