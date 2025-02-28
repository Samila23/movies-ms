package com.movies.ms.exception;

import java.io.Serial;

public class NotFoundException extends CoreException{

    @Serial
    private static final long serialVersionUID = 5952828639711873898L;

    public NotFoundException(final String message, final Object... args) {
        super(message, args);
    }
}
