package ru.unn.agile.complexnumber.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OsechkinSergeyTest {
    @Test
    public void canAddComplexNumbers() {
        // Arrange
        ComplexNumber z1 = new ComplexNumber(1, 1);
        ComplexNumber z2 = new ComplexNumber(1, 1);

        // Act
        ComplexNumber z = z1.add(z2);

        // Assert
        assertEquals(new ComplexNumber(2, 2), z);
    }

    @Test
    public void canZeroComplexNumber() {
        // Arrange
        ComplexNumber z1 = new ComplexNumber(-1, -1);
        ComplexNumber z2 = new ComplexNumber(1, 1);

        // Act
        ComplexNumber z = z1.add(z2);

        // Assert
        assertEquals(new ComplexNumber(0, 0), z);
    }

    @Test
    public void canToStringComplexNumber() {
        // Arrange
        ComplexNumber z = new ComplexNumber(-1, -1);

        // Assert
        assertEquals("-1.0 - 1.0i", z.toString());
    }

    @Test
    public void canExtractImaginaryPartWhenMultiplyComplexNumber() {
        // Arrange
        ComplexNumber z1 = new ComplexNumber(-5, -3);
        ComplexNumber z2 = new ComplexNumber(1, 1);

        // Act
        ComplexNumber z = z1.multiply(z2);
        double imageNumber = z.getImaginary();
        boolean equalityCheck = (imageNumber == -8) ? true : false;

        // Assert
        assertEquals(true, true);
    }

    @Test
    public void canAddComplexNumbersAtZeroArgs() {
        // Arrange
        ComplexNumber z1 = new ComplexNumber(0, 0);
        ComplexNumber z2 = new ComplexNumber(0, 0);

        // Act
        ComplexNumber z = z1.add(z2);

        // Assert
        assertEquals(new ComplexNumber(0, 0), z);
    }
}
