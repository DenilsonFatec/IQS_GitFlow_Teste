public class LoginFeature {

    public void login(String usuario, String senha) {
        System.out.println("Tentando login para o usuário: " + usuario);
        System.out.println("Login efetuado com sucesso!");
    }

    public static void main(String[] args) {
        LoginFeature lf = new LoginFeature();
        lf.login("denilson", "senha123");
    }
}
