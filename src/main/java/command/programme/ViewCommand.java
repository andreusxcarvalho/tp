package command.programme;

import command.CommandResult;

import programme.ProgrammeList;
import programme.Programme;
import history.History;

import java.util.logging.Level;


public class ViewCommand extends ProgrammeCommand {
    public static final String COMMAND_WORD = "view";

    public ViewCommand(int programmeIndex) {
        super(programmeIndex);
    }

    @Override
    public CommandResult execute(ProgrammeList programmes, History history){
        assert programmes != null : "ProgrammeList must not be null";

        Programme programme = programmes.getProgramme(programmeIndex);
        assert programme != null : "Programme must not be null";
        String result = String.format("Viewing programme: %n%s",programme);
        logger.log(Level.INFO, "ViewCommand executed successfully.");
        return new CommandResult(result);
    }
}
