package Commands;

import answerPackage.Answer;

/**
 * Created by fedor on 12.02.17.
 */
public class StartCommand extends Command{

    public StartCommand(String _answerText){
        super(_answerText);
    }

    @Override
    public Answer getAnswer(){

        Answer answer = new Answer(ConstantsCommands.START_MSG, null);

        return answer;
    }
}
