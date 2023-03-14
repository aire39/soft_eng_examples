public class File {
    private String fileName = "";

    File(String file_name) {
        fileName = file_name;
    }

    public void SetFileName(String file_name) {
        fileName = file_name;
    }

    public String GetFileName() {
        return fileName;
    }
}
