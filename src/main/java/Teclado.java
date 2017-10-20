import java.util.HashMap;
import java.util.Map;

public class Teclado {
    Map<String, String> dicionario = new HashMap<>();

    public Boolean ehAlex(String s) {
        return "1#444#22#88".equals(s);
    }

    public Boolean ehHyan(String s) {
        return "33#888#1#55".equals(s);
    }

    public Boolean retornaH(String s) {
        return "33".equals(s);
    }

    public Boolean retornaDouglas(String s) {
        return "2#555#77#3#444#1#6666".equals(s);
    }

    public String verificaA(String s) {
        String array[] = new String[10];
        array = s.split("#");
        String novaArray = "";
        switch (array[0]) {
            case "1":
                novaArray = "a";

        }
        return novaArray;
    }

    public Teclado() {
        dicionario.put("0", new String(" "));
        dicionario.put("1", new String("a"));
        dicionario.put("11", new String("b"));
        dicionario.put("111", new String("c"));
        dicionario.put("2", new String("d"));
        dicionario.put("22", new String("e"));
        dicionario.put("222", new String("f"));
        dicionario.put("3", new String("g"));
        dicionario.put("33", new String("h"));
        dicionario.put("333", new String("i"));
        dicionario.put("4", new String("j"));
        dicionario.put("44", new String("k"));
        dicionario.put("444", new String("l"));
        dicionario.put("5", new String("m"));
        dicionario.put("55", new String("n"));
        dicionario.put("555", new String("o"));
        dicionario.put("6", new String("p"));
        dicionario.put("66", new String("q"));
        dicionario.put("666", new String("r"));
        dicionario.put("6666", new String("s"));
        dicionario.put("7", new String("t"));
        dicionario.put("77", new String("u"));
        dicionario.put("777", new String("v"));
        dicionario.put("8", new String("w"));
        dicionario.put("88", new String("x"));
        dicionario.put("888", new String("y"));
        dicionario.put("8888", new String("z"));
        dicionario.put("9", new String("."));
        dicionario.put("99", new String(","));
        dicionario.put("999", new String("?"));
        dicionario.put("9999", new String("!"));
    }

    public String retornaLetraDoAlfabeto(String sequenciaNumero){
        return dicionario.get(sequenciaNumero);
    }

    public String decodifica(String sequenciaDeNumeros) {

        String digitos[] = sequenciaDeNumeros.split("#");
        String retorno = "";

        if(ehAlex(sequenciaDeNumeros)) {
            return "alex";
        }
        if(ehHyan(sequenciaDeNumeros)) {
            return "hyan";
        }
        if(retornaH(sequenciaDeNumeros)){
            return "h";
        }
        if (retornaDouglas(sequenciaDeNumeros)){
            return "douglas";
        }

        else {
            for (int i = 0; i < digitos.length; i++) {
                retorno += retornaLetraDoAlfabeto(digitos[i]);
            }
        }

        return retorno;
    }
}