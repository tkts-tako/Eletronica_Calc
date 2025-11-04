package eletronica_calc;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Arrays;

public class Eletronica_Calc extends Application {

    @Override
    public void start(Stage stage) {
        TabPane tabPane = new TabPane();

        // TAB 1: Cálculos básicos
        Tab tabBasico = new Tab("Cálculos Básicos");
        VBox layoutBasico = new VBox(10);
        layoutBasico.setPadding(new Insets(10));

        TextField campoU = new TextField(); campoU.setPromptText("Tensão (U)");
        TextField campoI = new TextField(); campoI.setPromptText("Corrente (I)");
        TextField campoR = new TextField(); campoR.setPromptText("Resistência (R)");

        Button btnCorrente = new Button("I = U / R");
        Button btnTensao = new Button("U = I × R");
        Button btnResistencia = new Button("R = U / I");
        Button btnPotencia = new Button("P = U × I");

        Label resultadoBasico = new Label();

        btnCorrente.setOnAction(e -> {
            try {
                double u = Double.parseDouble(campoU.getText());
                double r = Double.parseDouble(campoR.getText());
                resultadoBasico.setText(r == 0 ? "Erro: R não pode ser zero." : String.format("Corrente: %.2f A", u / r));
            } catch (Exception ex) {
                resultadoBasico.setText("Valores inválidos.");
            }
        });

        btnTensao.setOnAction(e -> {
            try {
                double i = Double.parseDouble(campoI.getText());
                double r = Double.parseDouble(campoR.getText());
                resultadoBasico.setText(String.format("Tensão: %.2f V", i * r));
            } catch (Exception ex) {
                resultadoBasico.setText("Valores inválidos.");
            }
        });

        btnResistencia.setOnAction(e -> {
            try {
                double u = Double.parseDouble(campoU.getText());
                double i = Double.parseDouble(campoI.getText());
                resultadoBasico.setText(i == 0 ? "Erro: I não pode ser zero." : String.format("Resistência: %.2f Ω", u / i));
            } catch (Exception ex) {
                resultadoBasico.setText("Valores inválidos.");
            }
        });

        btnPotencia.setOnAction(e -> {
            try {
                double u = Double.parseDouble(campoU.getText());
                double i = Double.parseDouble(campoI.getText());
                resultadoBasico.setText(String.format("Potência: %.2f W", u * i));
            } catch (Exception ex) {
                resultadoBasico.setText("Valores inválidos.");
            }
        });

        layoutBasico.getChildren().addAll(campoU, campoI, campoR, btnCorrente, btnTensao, btnResistencia, btnPotencia, resultadoBasico);
        tabBasico.setContent(layoutBasico);

        // TAB 2: Resistências
        Tab tabResistencias = new Tab("Resistências");
        VBox layoutResistencias = new VBox(10);
        layoutResistencias.setPadding(new Insets(10));

        TextField campoResistencias = new TextField();
        campoResistencias.setPromptText("Ex: 10, 20, 30");

        Button btnSerieR = new Button("R_eq em Série");
        Button btnParaleloR = new Button("R_eq em Paralelo");
        Label resultadoResistencias = new Label();

        btnSerieR.setOnAction(e -> {
            try {
                double[] resistencias = Arrays.stream(campoResistencias.getText().split(","))
                        .mapToDouble(s -> Double.parseDouble(s.trim())).toArray();
                double total = Arrays.stream(resistencias).sum();
                resultadoResistencias.setText(String.format("R_eq (série): %.2f Ω", total));
            } catch (Exception ex) {
                resultadoResistencias.setText("Valores inválidos.");
            }
        });

        btnParaleloR.setOnAction(e -> {
            try {
                double[] resistencias = Arrays.stream(campoResistencias.getText().split(","))
                        .mapToDouble(s -> Double.parseDouble(s.trim())).toArray();
                double inversoTotal = Arrays.stream(resistencias).map(r -> 1.0 / r).sum();
                resultadoResistencias.setText(inversoTotal == 0 ? "Erro: soma dos inversos é zero." : String.format("R_eq (paralelo): %.2f Ω", 1.0 / inversoTotal));
            } catch (Exception ex) {
                resultadoResistencias.setText("Valores inválidos.");
            }
        });

        layoutResistencias.getChildren().addAll(new Label("Resistências em ohms"), campoResistencias, btnSerieR, btnParaleloR, resultadoResistencias);
        tabResistencias.setContent(layoutResistencias);


        // TAB 3: Condensadores
        Tab tabCondensadores = new Tab("Condensadores");
        VBox layoutCondensadores = new VBox(10);
        layoutCondensadores.setPadding(new Insets(10));

        TextField campoCondensadores = new TextField();
        campoCondensadores.setPromptText("Ex: 10, 22, 47");

        Button btnSerieC = new Button("C_eq em Série");
        Button btnParaleloC = new Button("C_eq em Paralelo");
        Label resultadoCondensadores = new Label();

        btnSerieC.setOnAction(e -> {
            try {
                double[] condensadores = Arrays.stream(campoCondensadores.getText().split(","))
                        .mapToDouble(s -> Double.parseDouble(s.trim())).toArray();
                double inversoTotal = Arrays.stream(condensadores).map(c -> 1.0 / c).sum();
                resultadoCondensadores.setText(inversoTotal == 0 ? "Erro: soma dos inversos é zero." : String.format("C_eq (série): %.2f µF", 1.0 / inversoTotal));
            } catch (Exception ex) {
                resultadoCondensadores.setText("Valores inválidos.");
            }
        });

        btnParaleloC.setOnAction(e -> {
            try {
                double[] condensadores = Arrays.stream(campoCondensadores.getText().split(","))
                        .mapToDouble(s -> Double.parseDouble(s.trim())).toArray();
                double total = Arrays.stream(condensadores).sum();
                resultadoCondensadores.setText(String.format("C_eq (paralelo): %.2f µF", total));
            } catch (Exception ex) {
                resultadoCondensadores.setText("Valores inválidos.");
            }
        });

        layoutCondensadores.getChildren().addAll(new Label("Condensadores em µF"), campoCondensadores, btnSerieC, btnParaleloC, resultadoCondensadores);
        tabCondensadores.setContent(layoutCondensadores);

        // TAB 4: Explicações
        Tab tabExplicacoes = new Tab("Explicações");
        VBox layoutExplicacoes = new VBox(10);
        layoutExplicacoes.setPadding(new Insets(10));

        Label texto = new Label("""
📘 Significado das variáveis:
- U: Tensão elétrica (volts)
- I: Corrente elétrica (amperes)
- R: Resistência elétrica (ohms)
- P: Potência elétrica (watts)
- C: Capacitância (farads)

📐 Fórmulas principais:
- Corrente: I = U / R
- Tensão: U = I × R
- Resistência: R = U / I
- Potência: P = U × I
- Capacitores em série: 1/C_eq = 1/C1 + 1/C2 + ...
- Capacitores em paralelo: C_eq = C1 + C2 + ...
""");

        layoutExplicacoes.getChildren().add(texto);
        tabExplicacoes.setContent(layoutExplicacoes);

        // TAB 5: Conversões
        Tab tabConversoes = new Tab("Conversões");
        VBox layoutConversoes = new VBox(10);
        layoutConversoes.setPadding(new Insets(10));

        TextField campoValor = new TextField();
        campoValor.setPromptText("Valor base (ex: 4700)");

        ComboBox<String> unidadeOrigem = new ComboBox<>();
        unidadeOrigem.getItems().addAll("µ (micro)", "m (mili)", "k (kilo)", "M (mega)");
        unidadeOrigem.setPromptText("Unidade original");

        ComboBox<String> unidadeDestino = new ComboBox<>();
        unidadeDestino.getItems().addAll("µ (micro)", "m (mili)", "k (kilo)", "M (mega)");
        unidadeDestino.setPromptText("Unidade destino");

        Button btnConverter = new Button("Converter");
        Label resultadoConversao = new Label();

        btnConverter.setOnAction(e -> {
            try {
                double valor = Double.parseDouble(campoValor.getText());
                String origem = unidadeOrigem.getValue();
                String destino = unidadeDestino.getValue();

                double fatorOrigem = switch (origem) {
                    case "µ (micro)" -> 1e-6;
                    case "m (mili)" -> 1e-3;
                    case "k (kilo)" -> 1e3;
                    case "M (mega)" -> 1e6;
                    default -> 1;
                };

                double fatorDestino = switch (destino) {
                    case "µ (micro)" -> 1e-6;
                    case "m (mili)" -> 1e-3;
                    case "k (kilo)" -> 1e3;
                    case "M (mega)" -> 1e6;
                    default -> 1;
                };

                double convertido = (valor * fatorOrigem) / fatorDestino;
                resultadoConversao.setText(String.format("Resultado: %.6f %s", convertido, destino));
            } catch (Exception ex) {
                resultadoConversao.setText("Erro: verifica os valores e unidades.");
            }
        });

        layoutConversoes.getChildren().addAll(
            new Label("Conversão entre unidades elétricas"),
            campoValor,
            unidadeOrigem,
            unidadeDestino,
            btnConverter,
            resultadoConversao
        );
        tabConversoes.setContent(layoutConversoes);
        
        tabPane.getTabs().addAll(
            tabBasico,
            tabResistencias,
            tabCondensadores,
            tabExplicacoes,
            tabConversoes
        );

        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        Scene scene = new Scene(tabPane, 500, 450);
        stage.setTitle("Calculadora de Eletrónica Completa");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}