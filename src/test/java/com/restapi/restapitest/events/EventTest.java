package com.restapi.restapitest.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventTest {

    // 생성자 테스트 코드
    @Test
    public void builder() {
        Event event = Event.builder()
                .name("title")
                .description("REST APO")
                .build();
        assertThat(event).isNotNull();
    }

    // 자바 빈 테스트 코드
    @Test
    public void javaBean() {
        // Given
        String name = "event";
        String description = "Spring boot";

        // When
        Event event = new Event();
        event.setName(name);
        event.setDescription(description);

        // Then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }


}