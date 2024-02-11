package br.com.josenaldo.lep.domain;

public record LibraryEvent(Integer libraryEventId, LibraryEventType libraryEventType, Book book) {

}
