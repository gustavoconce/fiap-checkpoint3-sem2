package com.github.gustavoconce.checkpoint3.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.github.gustavoconce.checkpoint3.dtos.ContatosRequestCreateDto;
import com.github.gustavoconce.checkpoint3.dtos.ContatosRequestUpdateDto;
import com.github.gustavoconce.checkpoint3.dtos.ContatosResponseDto;
import com.github.gustavoconce.checkpoint3.model.Contatos;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ContatosMapper {

    private  final ModelMapper modelMapper;

    public ContatosResponseDto toDto(Contatos contatos) {
        return modelMapper.map(contatos, ContatosResponseDto.class);
    }

    public Contatos toModel(ContatosRequestCreateDto dto) {
        return modelMapper.map(dto, Contatos.class);
    }

    public Contatos toModel(Long id, ContatosRequestUpdateDto dto) {
        Contatos result = modelMapper.map(dto, Contatos.class);
        result.setId(id);
        return result;
    }

}
