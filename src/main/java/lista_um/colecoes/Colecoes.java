package lista_um.colecoes;


import java.util.*;

public class Colecoes {

    public static void main(String[] args) {
        // List - Permite Duplicidade
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(20);
        numeros.add(222);
        System.out.println("List " + numeros);

        // Set - Nao Permite Duplicidade
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(20);
        conjunto.add(80);
        conjunto.add(750);
        conjunto.add(20);
        System.out.println("Conjunto = " + conjunto);

        // Map - Lista com Chave/Valor
        Map<Integer, String> mapaCidade = new HashMap<>();
        mapaCidade.put(1, "jdbc://locahost:3606/senac-mysql");
        mapaCidade.put(2, "jdbc://locahost:3606/senac-postgres");
        mapaCidade.put(3, "Americo Brasiliense");
        System.out.println("Mapa = " + mapaCidade.get(2));

        Integer j = 10;
        List<Integer> novosNumeros = List.of(1, 2, 5, 7, 95, 654, 23,3,988);
        novosNumeros.forEach(n -> {
            Integer x = n + j;
            System.out.println("x = " + x);
        });
        for(int i = 0; i<novosNumeros.size(); i++){
            System.out.println(novosNumeros.get(i));
        }
        for(Integer n : novosNumeros){
            System.out.println(n);
        }
    }
}
