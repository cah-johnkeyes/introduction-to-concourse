package com.cah.izero;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

class GreetingMachineTest {

    private String salutation = "Sup";
    private GreetingMachine machine;

    @Before
    public void setup() {
        machine = new GreetingMachine(salutation);
    }

    @Test
    public void itGreetsAName() {
        assertThat(machine.greet()).isEqualTo(salutation);
    }

    @Test
    public void itGreetsNoName() {
        assertThat(machine.greet("Dude")).isEqualTo(salutation + ", Dude");
    }
}
