package janggi.domain;

import janggi.domain.piece.PieceType;

public record PieceInitInfo(Position position, Side side, PieceType pieceType) {
    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position().getY();
    }

    public String getPieceType() {
        return pieceType.getName();
    }

    public String getSide() {
        return side.getName();
    }
}
