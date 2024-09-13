package mate.academy.rickandmorty.mapper;

import mate.academy.rickandmorty.model.Character;
import mate.academy.rickandmorty.config.MapperConfig;
import mate.academy.rickandmorty.dto.external.CharacterResponseDto;
import mate.academy.rickandmorty.dto.internal.CharacterDto;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(config = MapperConfig.class)
public interface CharacterMapper {
    CharacterDto toDto(Character character);

    List<CharacterDto> toDtoList(List<Character> characters);

    Character toModel(CharacterDto characterDto);

    Character toModel(CharacterResponseDto characterResponseDto);

    List<Character> toModelList(List<CharacterResponseDto> characterResponseDtos);
}
