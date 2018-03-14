package ru.petrov.s04;

public enum Alphabet {

    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

    public static int getLetterPosition(String letter) {

        return Alphabet.valueOf(letter).ordinal() + 1;

    }

}
