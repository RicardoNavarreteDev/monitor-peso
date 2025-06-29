package com.healthtrack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlataformaFuncionalTest {

    private WebDriver driver;

    @BeforeEach
public void setup() {
    String ciEnv = System.getenv("CI");
    if (ciEnv != null && ciEnv.equalsIgnoreCase("true")) {
        // En CI, no poner path explícito, espera que chromedriver esté en PATH
        driver = new ChromeDriver();
    } else {
        // En local usar ruta explicita a chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}

    @Test
public void testActualizarPeso() {
    // Obtiene la ruta absoluta del archivo HTML local
    String path = Paths.get("src/main/resources/web/index.html").toAbsolutePath().toUri().toString();
    driver.get(path);

    // Encuentra el input de peso, limpia y escribe 80
    WebElement inputPeso = driver.findElement(By.id("pesoInput"));
    inputPeso.clear();
    inputPeso.sendKeys("80");

    // Encuentra y clickea el botón para actualizar
    WebElement btnActualizar = driver.findElement(By.id("actualizarPesoBtn"));
    btnActualizar.click();

    // Pausa 5 segundos para ver el navegador antes de cerrarlo
    try {
        Thread.sleep(5000); // 5000 milisegundos = 5 segundos
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Verifica que el peso actualizado en la página es "80"
    WebElement pesoActual = driver.findElement(By.id("pesoActual"));
    assertEquals("80", pesoActual.getText());
}

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
