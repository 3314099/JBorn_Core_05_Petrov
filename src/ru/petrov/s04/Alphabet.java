package ru.petrov.s04;

public enum Alphabet {

    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

    int getLetterPosition() {
        return this.ordinal() + 1;
    }
}
