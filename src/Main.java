import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Algoritmo1();
        Algoritmo2();
        Algoritmo3();
        Algoritmo4();
        Algoritmo5();
        Algoritmo6();
        Algoritmo7();
        Algoritmo8();
        Algoritmo9();
        Algoritmo10();
        Algoritmo11();
        Algoritmo15();
    }

    private static void Algoritmo1() {
        System.out.println("Algoritmo1");
        Scanner Algoritmo1 = new Scanner(System.in);

        int num1, num2, opcao, prossiga;
        prossiga = 1;
        while (prossiga == 1) {

            System.out.print("Digite um número inteiro: ");
            num1 = Algoritmo1.nextInt();
            System.out.print("Digite outro número inteiro: ");
            num2 = Algoritmo1.nextInt();

            System.out.println("Escolha a opção:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Quociente inteiro da divisão");
            System.out.print("Digite a opção: ");
            opcao = Algoritmo1.nextInt();

            if (opcao == 1) {
                System.out.println("Resultado: " + (num1 + num2));

            } else if (opcao == 2) {
                System.out.println("Resultado: " + (num1 - num2));

            } else if (opcao == 3) {
                System.out.println("Resultado: " + (num1 * num2));

            } else if (opcao == 4) {
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
            } else {
                System.out.println("Opção inválida.");
            }
            System.out.print("Digite 1 para continuar e 0 para encerrar: ");
            prossiga = Algoritmo1.nextInt();
        }
        System.out.println("Encerrado.");
    }

    private static void Algoritmo2() {
        System.out.println("Algoritmo2");
        Scanner Algoritmo2 = new Scanner(System.in);

        int numero = 1;
        int soma = 0;

        do {
            if (numero % 2 != 0 && numero % 3 == 0) {
                soma = soma + numero;
            }
            numero = numero + 1;
        } while (numero <= 500);

        System.out.println("A soma dos números é: " + soma);
    }

    private static void Algoritmo3() {
        System.out.println("Algoritmo3");
        Scanner Algoritmo3 = new Scanner(System.in);

        int antigo = 0;
        int recente = 0;
        int mesesRecente = 0;
        int mesesAntigo = 0;
        int empregado;
        int meses;

        for (int i = 1; i <= 300; i++) {
            System.out.print("Digite o número do empregado: ");
            empregado = Algoritmo3.nextInt();
            System.out.print("Digite os meses de trabalho: ");
            meses = Algoritmo3.nextInt();
            if (empregado == 0 && meses == 0) {
                break;
            }
            System.out.println("Empregado mais recente: " + recente);
            System.out.println("Meses de contribuição: " + mesesRecente);
            System.out.println("Empregado mais antigo: " + antigo);
            System.out.println("Meses de contribuição: " + mesesAntigo);
        }
    }

    private static void Algoritmo4() {
        System.out.println("Algoritmo4");
        Scanner Algoritmo4 = new Scanner(System.in);

        int homens = 0;
        int mulheres = 0;
        double altura;
        double menorAltura = 0;
        double somaMulheres = 0;
        double maiorAltura = 0;
        double mediaMulheres;
        int sexo;
        int sexoMaisAlto = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite a altura " + i + ": ");
            altura = Algoritmo4.nextDouble();

            System.out.print("Digite o sexo (M/F): ");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            sexo = Algoritmo4.nextInt();
            if (i == 1) {
                menorAltura = altura;
                maiorAltura = altura;
                sexoMaisAlto = sexo;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
                sexoMaisAlto = sexo;
            }
            if (sexo == 1) {
                homens = homens + 1;
            }
            if (sexo == 2) {
                mulheres = mulheres + 1;
                somaMulheres = somaMulheres + altura;
            }
        }
        mediaMulheres = somaMulheres / mulheres;

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura (M): " + mediaMulheres);
        System.out.println("Número de homens: " + homens);
        if (sexoMaisAlto == 1) {
            System.out.println("Sexo da pessoa mais alta: Masculino");
        } else {
            System.out.println("Sexo da pessoa mais alta: Feminino");
        }
    }

    private static void Algoritmo5() {
        System.out.println("Algoritmo5");
        Scanner Algoritmo5 = new Scanner(System.in);

        Double salario;
        Double somaSalarios = 0.00;
        Double maiorSalario = 0.00;
        int filhos;
        int somaFilhos = 0;
        int pessoas = 0;
        int salarioate250 = 0;

        System.out.print("Digite o salário: ");
        salario = Algoritmo5.nextDouble();
        while (salario >= 0) {
            System.out.print("Digite o número de filhos: ");
            filhos = Algoritmo5.nextInt();

            somaSalarios = somaSalarios + salario;
            somaFilhos = somaFilhos + filhos;
            pessoas = pessoas + 1;

            System.out.print("Digite o salário: ");
            salario = Algoritmo5.nextDouble();
        }
        if (pessoas > 0) {
            double mediaSalario = somaSalarios / pessoas;
            double mediaFilhos = (double) somaFilhos / pessoas;
            double percentual = (double) salarioate250 / pessoas * 100;

            System.out.println("Média do salário da população: " + mediaSalario);
            System.out.println("Média de filhos: " + mediaFilhos);
            System.out.println("Maior salário: " + maiorSalario);
            System.out.println("Percentual de pessoas do salário especificado: " + percentual);
        }
    }

    private static void Algoritmo6() {
        System.out.println("Algoritmo6");
        Scanner Algoritmo6 = new Scanner(System.in);

        double valor;
        double soma = 0;
        int quantidade = 0;
        int positivos = 0;
        int negativos = 0;

        System.out.print("Digite um valor: ");
        valor = Algoritmo6.nextDouble();

        while (valor != 0) {
        }
        if (valor > 0) {
            positivos = positivos + 1;
        }
        if (valor < 0) {
            negativos = negativos + 1;
        }
        if (quantidade > 0) {
        }
        double media = soma / quantidade;
        double porcentagempositivos = positivos / quantidade * 100;
        double porcentagemnegativos = negativos / quantidade * 100;

        System.out.println("Média: " + media);
        System.out.println("Quantidade de positivos: " + positivos);
        System.out.println("Quantidade de negativos: " + negativos);
        System.out.println("Percentual de positivos: " + porcentagempositivos + "%");
        System.out.println("Percentual de negativos: " + porcentagemnegativos + "%");
    }

    private static void Algoritmo7() {
        System.out.println("Algoritmo7");
        Scanner Algoritmo7 = new Scanner(System.in);

        int numero;
        int soma = 0;
        int quantidade = 0;
        double media = 0.00;

        for (int i = 1; i <= 75; i++) {
            System.out.print("Digite um número: ");
            numero = Algoritmo7.nextInt();
            soma = soma + numero;
            quantidade = quantidade + 1;
        }

        media = soma / quantidade;

        System.out.println("Média: " + media);
        System.out.println("Quantidade de números: " + quantidade);
    }

    private static void Algoritmo8() {
        System.out.println("Algoritmo8");
        Scanner Algoritmo8 = new Scanner(System.in);

        double maiorAltura = 0.00;
        double menorAltura = 0.00;
        String nomeMaior;
        String nomeMenor;
        double somaHomens = 0.00;
        double somaMulheres = 0;
        double somaTotal = 0;
        int qtdHomens = 0;
        int qtdMulheres = 0;
        int sexo;
        int totalAmigos = 15;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o nome: ");
            String nome = Algoritmo8.next();
            System.out.print("Altura: ");
            double altura = Algoritmo8.nextDouble();

            do {
                System.out.print("Sexo (1-MASCULINO/2-FEMININO): ");
                sexo = Algoritmo8.nextInt();
                if (sexo != 1 && sexo != 2) {
                    System.out.println("Código inválido! Digite apenas 1 ou 2.");
                }
            } while (sexo != 1 && sexo != 2);
            somaTotal = somaTotal + altura;
            if (i == 1) {
                maiorAltura = altura;
                menorAltura = altura;
                nomeMaior = nome;
                nomeMenor = nome;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaior = nome;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                nomeMenor = nome;
            }
            if (sexo == 1) {
                somaHomens = somaHomens + altura;
                qtdHomens = qtdHomens + 1;
            } else {
                somaMulheres = somaMulheres + altura;
                qtdMulheres = qtdMulheres + 1;
            }
        }
        double mediaTurma = somaTotal / 15;
        double mediaHomens = somaHomens / qtdHomens;
        double mediaMulheres = somaMulheres / qtdMulheres;

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média dos homens: " + mediaHomens);
        System.out.println("Média das mulheres: " + mediaMulheres);
        System.out.println("Média geral da turma: " + mediaTurma);
    }

    private static void Algoritmo9() {
        System.out.println("Algoritmo9");
        Scanner Algoritmo9 = new Scanner(System.in);

        double maiorNota = 0;
        double menorNota = 0;
        double nota;
        int numeroAlunos;

        System.out.print("Digite o número de alunos: ");
        numeroAlunos = Algoritmo9.nextInt();

        for (int i = 1; i <= 15; i++) {
            do {
                System.out.print("Digite a nota do " + i + "º aluno(0 a 15): ");
                nota = Algoritmo9.nextDouble();
                if (nota < 0 || nota > 15) {
                    System.out.println("Nota inválida!");
                }
            } while (nota < 0 || nota > 15);
            if (i == 1) {
                maiorNota = nota;
                menorNota = nota;
            } else {
                if (nota > maiorNota) {
                    maiorNota = nota;
                }
                if (nota < menorNota) {
                    menorNota = nota;
                }
            }
        }
        System.out.println("Maior nota obtida: " + maiorNota);
        System.out.println("Menor nota obtida: " + menorNota);
    }

    private static void Algoritmo10() {
        System.out.println("Algoritmo10");
        Scanner Algoritmo10 = new Scanner(System.in);

        double centimetros;

        for (int polegada = 1; polegada <= 20; polegada++) {
            centimetros = polegada * 2.54;
            System.out.println(polegada + "Em polegada= " + centimetros + "cm");
        }
    }

    private static void Algoritmo11() {
        System.out.println("Algoritmo11");
        Scanner Algoritmo11 = new Scanner(System.in);

        int limiteInferior;
        int limiteSuperior;
        int soma = 0;
        int i;

        System.out.print("Digite o limite inferior: ");
        limiteInferior = Algoritmo11.nextInt();
        System.out.print("Digite o limite superior: ");
        limiteSuperior = Algoritmo11.nextInt();

        i = limiteInferior;
        while (i <= limiteSuperior) {
            if (i % 2 == 0) {
                soma = soma + i;
            }
            i = i + 1;
        }
        System.out.println("A soma dos números pares é: " + soma);
    }

    private static void Algoritmo15() {
        System.out.println("Algoritmo15");
        Scanner Algoritmo15 = new Scanner(System.in);

        int matricula;
        int matriculaDoMaior = 0;
        int matriculaSegundaMaior = 0;
        double nota;
        double maiorNota = 0;
        double segundaMaiorNota = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite a matrícula do " + i + "aluno: ");
            matricula = Algoritmo15.nextInt();
            System.out.print("Digite a nota do " + i + "aluno: ");
            nota = Algoritmo15.nextDouble();

            if (nota > maiorNota) {
                segundaMaiorNota = maiorNota;
                matriculaSegundaMaior = matriculaDoMaior;

                maiorNota = nota;
                matriculaDoMaior = matricula;

            } else if (nota > segundaMaiorNota) {
                segundaMaiorNota = nota;
                matriculaSegundaMaior = matricula;
            }
        }
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Matrícula do aluno: " + matriculaDoMaior);
        System.out.println("Segunda maior nota: " + segundaMaiorNota);
        System.out.println("Matrícula do aluno: " + matriculaSegundaMaior);
    }
}
