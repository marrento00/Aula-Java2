package enums.exemplo1;

import heranca.exemplo1.Pessoa;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Cliente obj = new Cliente(21, "Felipe", 2);
        if(obj instanceof Cliente){
            Cliente cliente = obj;
        }
        System.out.println(obj);

        //TIP Pressione <shortcut actionId="ShowIntentionActions"/> com seu caret no texto destacado
        // para ver como IntelliJ IDEA sugere corrigi-lo.
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Pressione <shortcut actionId="Debug"/> para iniciar a depuração do seu código. Definimos um ponto de interrupção <icon src="AllIcons.Debugger.Db_set_breakpoint"/>
            // para você, mas você sempre pode adicionar mais pressionando <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}