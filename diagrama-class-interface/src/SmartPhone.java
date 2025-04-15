public class SmartPhone {

        public static void main(String[] args) {
            IPhone meuIphone = new IPhone();
    
            // Usando como reprodutor musical
            meuIphone.selecionarMusica("Imagine - John Lennon");
            meuIphone.tocar();
            meuIphone.pausar();
    
            // Usando como telefone
            meuIphone.ligar("11999999999");
            meuIphone.atender();
            meuIphone.iniciarCorreioVoz();
    
            // Usando como navegador
            meuIphone.exibirPagina("https://www.apple.com");
            meuIphone.adicionarNovaAba();
            meuIphone.atualizarPagina();
        }
    }
    

