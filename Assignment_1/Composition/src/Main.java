public class Main {
    public static void main(String[] args) {

        Folder php_demo1_folder = new Folder("php_demo1");

        Folder sources_folder = new Folder("Sources");
        php_demo1_folder.AddFolder(sources_folder);

        Folder phalcon_folder = new Folder(".phalcon");
        sources_folder.AddFolder(phalcon_folder);

        Folder app_folder = new Folder("app");
        sources_folder.AddFolder(app_folder);

        Folder config_folder = new Folder("config");
        app_folder.AddFolder(config_folder);

        Folder controllers_folder = new Folder("controllers");
        app_folder.AddFolder(controllers_folder);

        Folder library_folder = new Folder("library");
        app_folder.AddFolder(library_folder);

        Folder migrations_folder = new Folder("migrations");
        app_folder.AddFolder(migrations_folder);

        Folder models_folder = new Folder("models");
        app_folder.AddFolder(models_folder);

        Folder views_folder = new Folder("views");
        app_folder.AddFolder(views_folder);

        Folder cache_folder = new Folder("cache");
        sources_folder.AddFolder(cache_folder);

        Folder public_folder = new Folder("public");
        sources_folder.AddFolder(public_folder);

        public_folder.AddFile(new File("htaccess"));
        public_folder.AddFile(new File(".htrouter.php"));
        public_folder.AddFile(new File("index.html"));

        Folder include_path_folder = new Folder("Include Path");
        php_demo1_folder.AddFolder(include_path_folder);

        Folder remote_files_folder = new Folder("Remote Files");
        php_demo1_folder.AddFolder(remote_files_folder);

        System.out.println("Original Folder Structure\n--------------------------------------------");
        php_demo1_folder.PrintFileStructure();

        System.out.println();
        System.out.println();

        System.out.println("Folder Structure After Deleting app Folder\n--------------------------------------------");
        sources_folder.Delete(app_folder);
        php_demo1_folder.PrintFileStructure();

        System.out.println();
        System.out.println();

        System.out.println("Folder Structure After Deleting public Folder\n--------------------------------------------");
        sources_folder.Delete(public_folder);
        php_demo1_folder.PrintFileStructure();
    }
}