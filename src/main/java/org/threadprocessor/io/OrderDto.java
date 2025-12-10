package org.threadprocessor.io;

import java.time.LocalDate;

public record OrderDto(String id, LocalDate date, String customerID) {
}
