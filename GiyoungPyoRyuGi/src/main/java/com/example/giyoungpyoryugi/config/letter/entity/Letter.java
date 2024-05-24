package com.example.giyoungpyoryugi.config.letter.entity;

import com.example.giyoungpyoryugi.config.letter.dto.LetterReadDTO;
import com.example.giyoungpyoryugi.config.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Letter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long letterId;
    private String letterContents;
    private String letterTitle;
    private String letterDate;
    private Integer letterEmoticon;

    @ManyToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    public static Letter toEntity(LetterReadDTO letterReadDTO) {
        return Letter.builder()
                .letterId(letterReadDTO.getLetterId())
                .letterContents(letterReadDTO.getLetterContents())
                .letterTitle(letterReadDTO.getLetterTitle())
                .letterDate(letterReadDTO.getLetterDate())
                .letterEmoticon(letterReadDTO.getLetterEmoticon())
                .build();
    }
}
