package command.programme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class EditCommandTest {
    @Test
    public void testIsExit_returnsFalse() {
        EditCommand editCommand = new EditCommand();
        assertFalse(editCommand.isExit());
    }
}
