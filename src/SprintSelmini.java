import java.util.Scanner;

public class SprintSelmini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = 2;
        int x = 1;
        double custoTotal = 0;
        String comando;
        int distancia = 0;

        //COMO SE LOCALIZAR NO MAPA//
        //FRENTE = SOBE ---- Y-
        //TRAS = DESCE ---- Y+
        //DIREITA = DIREITA ---- X+
        //ESQUERDA = ESQUERDA ---- X-

        System.out.println("Posição inicial: (2,1)");

        // ================= COMANDO 1 =================
        System.out.println("Digite comando 1:");
        comando = sc.next();

        // VALIDANDO SE A DIREÇÃO RECEBIDA É VÁLIDA
        if ((comando.equalsIgnoreCase("FRENTE") || comando.equalsIgnoreCase("TRAS") || comando.equalsIgnoreCase("ESQUERDA") || comando.equalsIgnoreCase("DIREITA"))) {
            System.out.println("Digite a distancia, entre 1 e 10: ");
            distancia = sc.nextInt();

            // VALIDANDO SE DISTÂNCIA É POSITIVA
            if (distancia > 0) {
                // CALCULANDO NOVA POSIÇÃO COM BASE NO COMANDO E DISTANCIA
                if (comando.equalsIgnoreCase("FRENTE")) y -= distancia;
                else if (comando.equalsIgnoreCase("TRAS")) y += distancia;
                else if (comando.equalsIgnoreCase("DIREITA")) x += distancia;
                else if (comando.equalsIgnoreCase("ESQUERDA")) x -= distancia;

                // VALIDANDO COLISÃO COM PRATELEIRAS DO MAPA
                if (((y == 2 && (x <= 6))
                        || (x == 6 && (y >= 2 && y <= 8))
                        || (y == 8 && (x >= 6 && x <= 13))
                        || (x == 13 && (y >= 3 && y <= 8))
                        || (y == 8 && (x >= 13 && x <= 16))
                        || (x == 16 && (y >= 3 && y <= 8))
                        || (y == 8 && (x >= 16)))) {

                    // VALIDANDO COLISÃO COM LIMITES DO MAPA
                    if (!(x < 0 || x > 18 || y < 0 || y > 13)) {
                        // CALCULA CUSTO PERCORRIDO
                        custoTotal += distancia * 0.5;

                        // ================= COMANDO 2 =================
                        System.out.println("Digite comando 2:");
                        comando = sc.next();

                        // VALIDANDO SE A DIREÇÃO RECEBIDA É VÁLIDA
                        if ((comando.equalsIgnoreCase("FRENTE") || comando.equalsIgnoreCase("TRAS") || comando.equalsIgnoreCase("ESQUERDA") || comando.equalsIgnoreCase("DIREITA"))) {
                            System.out.println("Digite a distancia, entre 1 e 10: ");
                            distancia = sc.nextInt();

                            // VALIDANDO SE DISTÂNCIA É POSITIVA
                            if (distancia > 0) {
                                // CALCULANDO NOVA POSIÇÃO COM BASE NO COMANDO E DISTANCIA
                                if (comando.equalsIgnoreCase("FRENTE")) y -= distancia;
                                else if (comando.equalsIgnoreCase("TRAS")) y += distancia;
                                else if (comando.equalsIgnoreCase("DIREITA")) x += distancia;
                                else if (comando.equalsIgnoreCase("ESQUERDA")) x -= distancia;

                                // VALIDANDO COLISÃO COM PRATELEIRAS DO MAPA
                                if (((y == 2 && (x <= 6))
                                        || (x == 6 && (y >= 2 && y <= 8))
                                        || (y == 8 && (x >= 6 && x <= 13))
                                        || (x == 13 && (y >= 3 && y <= 8))
                                        || (y == 8 && (x >= 13 && x <= 16))
                                        || (x == 16 && (y >= 3 && y <= 8))
                                        || (y == 8 && (x >= 16)))) {

                                    // VALIDANDO COLISÃO COM LIMITES DO MAPA
                                    if (!(x < 0 || x > 18 || y < 0 || y > 13)) {
                                        // CALCULA CUSTO PERCORRIDO
                                        custoTotal += distancia * 0.5;

                                        // ================= COMANDO 3 =================
                                        System.out.println("Digite comando 3:");
                                        comando = sc.next();

                                        // VALIDANDO SE A DIREÇÃO RECEBIDA É VÁLIDA
                                        if ((comando.equalsIgnoreCase("FRENTE") || comando.equalsIgnoreCase("TRAS") || comando.equalsIgnoreCase("ESQUERDA") || comando.equalsIgnoreCase("DIREITA"))) {
                                            System.out.println("Digite a distancia, entre 1 e 10: ");
                                            distancia = sc.nextInt();

                                            // VALIDANDO SE DISTÂNCIA É POSITIVA
                                            if (distancia > 0) {
                                                // CALCULANDO NOVA POSIÇÃO COM BASE NO COMANDO E DISTANCIA
                                                if (comando.equalsIgnoreCase("FRENTE")) y -= distancia;
                                                else if (comando.equalsIgnoreCase("TRAS")) y += distancia;
                                                else if (comando.equalsIgnoreCase("DIREITA")) x += distancia;
                                                else if (comando.equalsIgnoreCase("ESQUERDA")) x -= distancia;

                                                // VALIDANDO COLISÃO COM PRATELEIRAS DO MAPA
                                                if (((y == 2 && (x <= 6))
                                                        || (x == 6 && (y >= 2 && y <= 8))
                                                        || (y == 8 && (x >= 6 && x <= 13))
                                                        || (x == 13 && (y >= 3 && y <= 8))
                                                        || (y == 8 && (x >= 13 && x <= 16))
                                                        || (x == 16 && (y >= 3 && y <= 8))
                                                        || (y == 8 && (x >= 16)))) {

                                                    // VALIDANDO COLISÃO COM LIMITES DO MAPA
                                                    if (!(x < 0 || x > 18 || y < 0 || y > 13)) {
                                                        // CALCULA CUSTO PERCORRIDO
                                                        custoTotal += distancia * 0.5;

                                                        // ================= COMANDO 4 =================
                                                        System.out.println("Digite comando 4:");
                                                        comando = sc.next();

                                                        // VALIDANDO SE A DIREÇÃO RECEBIDA É VÁLIDA
                                                        if ((comando.equalsIgnoreCase("FRENTE") || comando.equalsIgnoreCase("TRAS") || comando.equalsIgnoreCase("ESQUERDA") || comando.equalsIgnoreCase("DIREITA"))) {
                                                            System.out.println("Digite a distancia, entre 1 e 10: ");
                                                            distancia = sc.nextInt();

                                                            // VALIDANDO SE DISTÂNCIA É POSITIVA
                                                            if (distancia > 0) {
                                                                // CALCULANDO NOVA POSIÇÃO COM BASE NO COMANDO E DISTANCIA
                                                                if (comando.equalsIgnoreCase("FRENTE")) y -= distancia;
                                                                else if (comando.equalsIgnoreCase("TRAS"))
                                                                    y += distancia;
                                                                else if (comando.equalsIgnoreCase("DIREITA"))
                                                                    x += distancia;
                                                                else if (comando.equalsIgnoreCase("ESQUERDA"))
                                                                    x -= distancia;

                                                                // VALIDANDO COLISÃO COM PRATELEIRAS DO MAPA
                                                                if (((y == 2 && (x <= 6))
                                                                        || (x == 6 && (y >= 2 && y <= 8))
                                                                        || (y == 8 && (x >= 6 && x <= 13))
                                                                        || (x == 13 && (y >= 3 && y <= 8))
                                                                        || (y == 8 && (x >= 13 && x <= 16))
                                                                        || (x == 16 && (y >= 3 && y <= 8))
                                                                        || (y == 8 && (x >= 16)))) {

                                                                    // VALIDANDO COLISÃO COM LIMITES DO MAPA
                                                                    if (!(x < 0 || x > 18 || y < 0 || y > 13)) {
                                                                        // CALCULA CUSTO PERCORRIDO
                                                                        custoTotal += distancia * 0.5;

                                                                        // ================= COMANDO 5 =================
                                                                        System.out.println("Digite comando 5:");
                                                                        comando = sc.next();

                                                                        // VALIDANDO SE A DIREÇÃO RECEBIDA É VÁLIDA
                                                                        if ((comando.equalsIgnoreCase("FRENTE") || comando.equalsIgnoreCase("TRAS") || comando.equalsIgnoreCase("ESQUERDA") || comando.equalsIgnoreCase("DIREITA"))) {
                                                                            System.out.println("Digite a distancia, entre 1 e 10: ");
                                                                            distancia = sc.nextInt();

                                                                            // VALIDANDO SE DISTÂNCIA É POSITIVA
                                                                            if (distancia > 0) {
                                                                                // CALCULANDO NOVA POSIÇÃO COM BASE NO COMANDO E DISTANCIA
                                                                                if (comando.equalsIgnoreCase("FRENTE"))
                                                                                    y -= distancia;
                                                                                else if (comando.equalsIgnoreCase("TRAS"))
                                                                                    y += distancia;
                                                                                else if (comando.equalsIgnoreCase("DIREITA"))
                                                                                    x += distancia;
                                                                                else if (comando.equalsIgnoreCase("ESQUERDA"))
                                                                                    x -= distancia;

                                                                                // VALIDANDO COLISÃO COM PRATELEIRAS DO MAPA
                                                                                if (((y == 2 && (x <= 6))
                                                                                        || (x == 6 && (y >= 2 && y <= 8))
                                                                                        || (y == 8 && (x >= 6 && x <= 13))
                                                                                        || (x == 13 && (y >= 3 && y <= 8))
                                                                                        || (y == 8 && (x >= 13 && x <= 16))
                                                                                        || (x == 16 && (y >= 3 && y <= 8))
                                                                                        || (y == 8 && (x >= 16)))) {

                                                                                    // VALIDANDO COLISÃO COM LIMITES DO MAPA
                                                                                    if (!(x < 0 || x > 18 || y < 0 || y > 13)) {
                                                                                        // CALCULA CUSTO PERCORRIDO
                                                                                        custoTotal += distancia * 0.5;

                                                                                        // ================= COMANDO 6 =================
                                                                                        System.out.println("Digite comando 6:");
                                                                                        comando = sc.next();

                                                                                        // VALIDANDO SE A DIREÇÃO RECEBIDA É VÁLIDA
                                                                                        if ((comando.equalsIgnoreCase("FRENTE") || comando.equalsIgnoreCase("TRAS") || comando.equalsIgnoreCase("ESQUERDA") || comando.equalsIgnoreCase("DIREITA"))) {
                                                                                            System.out.println("Digite a distancia, entre 1 e 10: ");
                                                                                            distancia = sc.nextInt();

                                                                                            // VALIDANDO SE DISTÂNCIA É POSITIVA
                                                                                            if (distancia > 0) {
                                                                                                // CALCULANDO NOVA POSIÇÃO COM BASE NO COMANDO E DISTANCIA
                                                                                                if (comando.equalsIgnoreCase("FRENTE"))
                                                                                                    y -= distancia;
                                                                                                else if (comando.equalsIgnoreCase("TRAS"))
                                                                                                    y += distancia;
                                                                                                else if (comando.equalsIgnoreCase("DIREITA"))
                                                                                                    x += distancia;
                                                                                                else if (comando.equalsIgnoreCase("ESQUERDA"))
                                                                                                    x -= distancia;

                                                                                                // VALIDANDO COLISÃO COM PRATELEIRAS DO MAPA
                                                                                                if (((y == 2 && (x <= 6))
                                                                                                        || (x == 6 && (y >= 2 && y <= 8))
                                                                                                        || (y == 8 && (x >= 6 && x <= 13))
                                                                                                        || (x == 13 && (y >= 3 && y <= 8))
                                                                                                        || (y == 8 && (x >= 13 && x <= 16))
                                                                                                        || (x == 16 && (y >= 3 && y <= 8))
                                                                                                        || (y == 8 && (x >= 16)))) {

                                                                                                    // VALIDANDO COLISÃO COM LIMITES DO MAPA
                                                                                                    if (!(x < 0 || x > 18 || y < 0 || y > 13)) {
                                                                                                        // CALCULA CUSTO PERCORRIDO
                                                                                                        custoTotal += distancia * 0.5;

                                                                                                        // ================= COMANDO 7 =================
                                                                                                        System.out.println("Digite comando 7:");
                                                                                                        comando = sc.next();

                                                                                                        // VALIDANDO SE A DIREÇÃO RECEBIDA É VÁLIDA
                                                                                                        if ((comando.equalsIgnoreCase("FRENTE") || comando.equalsIgnoreCase("TRAS") || comando.equalsIgnoreCase("ESQUERDA") || comando.equalsIgnoreCase("DIREITA"))) {
                                                                                                            System.out.println("Digite a distancia, entre 1 e 10: ");
                                                                                                            distancia = sc.nextInt();

                                                                                                            // VALIDANDO SE DISTÂNCIA É POSITIVA
                                                                                                            if (distancia > 0) {
                                                                                                                // CALCULANDO NOVA POSIÇÃO COM BASE NO COMANDO E DISTANCIA
                                                                                                                if (comando.equalsIgnoreCase("FRENTE"))
                                                                                                                    y -= distancia;
                                                                                                                else if (comando.equalsIgnoreCase("TRAS"))
                                                                                                                    y += distancia;
                                                                                                                else if (comando.equalsIgnoreCase("DIREITA"))
                                                                                                                    x += distancia;
                                                                                                                else if (comando.equalsIgnoreCase("ESQUERDA"))
                                                                                                                    x -= distancia;

                                                                                                                // VALIDANDO COLISÃO COM PRATELEIRAS DO MAPA
                                                                                                                if (((y == 2 && (x <= 6))
                                                                                                                        || (x == 6 && (y >= 2 && y <= 8))
                                                                                                                        || (y == 8 && (x >= 6 && x <= 13))
                                                                                                                        || (x == 13 && (y >= 3 && y <= 8))
                                                                                                                        || (y == 8 && (x >= 13 && x <= 16))
                                                                                                                        || (x == 16 && (y >= 3 && y <= 8))
                                                                                                                        || (y == 8 && (x >= 16)))) {

                                                                                                                    // VALIDANDO COLISÃO COM LIMITES DO MAPA
                                                                                                                    if (!(x < 0 || x > 18 || y < 0 || y > 13)) {
                                                                                                                        // CALCULA CUSTO PERCORRIDO
                                                                                                                        custoTotal += distancia * 0.5;

                                                                                                                        // VALIDANDO SE CHEGOU NO DESTINO
                                                                                                                        if (x == 18 && y == 8) {
                                                                                                                            System.out.println("Chegou no destino!");

                                                                                                                            // VARIAVEL PARA PEGAR MENSAGEM DE DESEMPENHO DA ROTA
                                                                                                                            String classificacao;

                                                                                                                            // VALIDAÇÃO DO CUSTO TOTAL PARA ASSOCIAR DESEMPENHO DA ROTA
                                                                                                                            if (custoTotal <= 5) {
                                                                                                                                classificacao = "ROTA ECONÔMICA (Rota aprovada - Operação lucrativa).";
                                                                                                                            } else if (custoTotal <= 10) {
                                                                                                                                classificacao = "ROTA MODERADA (Rota aprovada com ressalvas).";
                                                                                                                            } else {
                                                                                                                                classificacao = "ROTA INEFICIENTE (Rota reprovada - Revisar trajeto).";
                                                                                                                            }

                                                                                                                            // EXIBIÇÃO DA MENSAGEM FINAL
                                                                                                                            System.out.println("Custo total: R$ " + custoTotal + " ? Classificação: " + classificacao);
                                                                                                                        } else {
                                                                                                                            System.out.println("Limite de comandos alcançado! Recomece.");
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        // AVISO DE ERRO COLISÃO COM LIMITES DO MAPA
                                                                                                                        System.out.println("COMANDO INVÁLIDO - saiu do limite!");
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    // AVISO DE ERRO COLISÃO COM PRATELEIRA
                                                                                                                    System.out.println("COMANDO INVÁLIDO - colisão com prateleira!");
                                                                                                                }
                                                                                                            } else {
                                                                                                                // AVISO DE ERRO DE DISTÂNCIA NEGATIVA
                                                                                                                System.out.println("Distância inválida!");
                                                                                                            }
                                                                                                        } else {
                                                                                                            // AVISO DE ERRO DE DIREÇÃO
                                                                                                            System.out.println("Comando inválido!");
                                                                                                        }
                                                                                                    } else {
                                                                                                        // AVISO DE ERRO COLISÃO COM LIMITES DO MAPA
                                                                                                        System.out.println("COMANDO INVÁLIDO - saiu do limite!");
                                                                                                    }
                                                                                                } else {
                                                                                                    // AVISO DE ERRO COLISÃO COM PRATELEIRA
                                                                                                    System.out.println("COMANDO INVÁLIDO - colisão com prateleira!");
                                                                                                }
                                                                                            } else {
                                                                                                // AVISO DE ERRO DE DISTÂNCIA NEGATIVA
                                                                                                System.out.println("Distância inválida!");
                                                                                            }
                                                                                        } else {
                                                                                            // AVISO DE ERRO DE DIREÇÃO
                                                                                            System.out.println("Comando inválido!");
                                                                                        }
                                                                                    } else {
                                                                                        // AVISO DE ERRO COLISÃO COM LIMITES DO MAPA
                                                                                        System.out.println("COMANDO INVÁLIDO - saiu do limite!");
                                                                                    }
                                                                                } else {
                                                                                    // AVISO DE ERRO COLISÃO COM PRATELEIRA
                                                                                    System.out.println("COMANDO INVÁLIDO - colisão com prateleira!");
                                                                                }
                                                                            } else {
                                                                                // AVISO DE ERRO DE DISTÂNCIA NEGATIVA
                                                                                System.out.println("Distância inválida!");
                                                                            }
                                                                        } else {
                                                                            // AVISO DE ERRO DE DIREÇÃO
                                                                            System.out.println("Comando inválido!");
                                                                        }
                                                                    } else {
                                                                        // AVISO DE ERRO COLISÃO COM LIMITES DO MAPA
                                                                        System.out.println("COMANDO INVÁLIDO - saiu do limite!");
                                                                    }
                                                                } else {
                                                                    // AVISO DE ERRO COLISÃO COM PRATELEIRA
                                                                    System.out.println("COMANDO INVÁLIDO - colisão com prateleira!");
                                                                }
                                                            } else {
                                                                // AVISO DE ERRO DE DISTÂNCIA NEGATIVA
                                                                System.out.println("Distância inválida!");
                                                            }
                                                        } else {
                                                            // AVISO DE ERRO DE DIREÇÃO
                                                            System.out.println("Comando inválido!");
                                                        }
                                                    } else {
                                                        // AVISO DE ERRO COLISÃO COM LIMITES DO MAPA
                                                        System.out.println("COMANDO INVÁLIDO - saiu do limite!");
                                                    }
                                                } else {
                                                    // AVISO DE ERRO COLISÃO COM PRATELEIRA
                                                    System.out.println("COMANDO INVÁLIDO - colisão com prateleira!");
                                                }
                                            } else {
                                                // AVISO DE ERRO DE DISTÂNCIA NEGATIVA
                                                System.out.println("Distância inválida!");
                                            }
                                        } else {
                                            // AVISO DE ERRO DE DIREÇÃO
                                            System.out.println("Comando inválido!");
                                        }
                                    } else {
                                        // AVISO DE ERRO COLISÃO COM LIMITES DO MAPA
                                        System.out.println("COMANDO INVÁLIDO - saiu do limite!");
                                    }
                                } else {
                                    // AVISO DE ERRO COLISÃO COM PRATELEIRA
                                    System.out.println("COMANDO INVÁLIDO - colisão com prateleira!");
                                }
                            } else {
                                // AVISO DE ERRO DE DISTÂNCIA NEGATIVA
                                System.out.println("Distância inválida!");
                            }
                        } else {
                            // AVISO DE ERRO DE DIREÇÃO
                            System.out.println("Comando inválido!");
                        }
                    } else {
                        // AVISO DE ERRO COLISÃO COM LIMITES DO MAPA
                        System.out.println("COMANDO INVÁLIDO - saiu do limite!");
                    }
                } else {
                    // AVISO DE ERRO COLISÃO COM PRATELEIRA
                    System.out.println("COMANDO INVÁLIDO - colisão com prateleira!");
                }
            } else {
                // AVISO DE ERRO DE DISTÂNCIA NEGATIVA
                System.out.println("Distância inválida!");
            }

        } else {
            // AVISO DE ERRO DE DIREÇÃO
            System.out.println("Comando inválido!");
        }
    }
}
