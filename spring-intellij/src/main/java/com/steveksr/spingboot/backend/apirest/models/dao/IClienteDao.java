package com.steveksr.spingboot.backend.apirest.models.dao;

import com.steveksr.spingboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
