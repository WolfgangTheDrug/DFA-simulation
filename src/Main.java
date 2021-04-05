class Main {
    public static boolean main(String[] args) {
        Alphabet alphabet = new Alphabet('a','b');

        State s0 = new State(0, true, false);
        State s1 = new State(1, false, false);
        State s2 = new State(2, false, false);
        State s3 = new State(3, false, true);
        SetOfStates sos = new SetOfStates(s0, s1, s2, s3);

        DFA dfaWordsThatEndWith_abb = new DFA(alphabet, sos);

        String wordAcceptable = "aaababababb"; // example of a word that should be accepted
        String wordUnacceptable = "baabaabaab"; //example of a word that should not be accepted
        return false;
    }
}
