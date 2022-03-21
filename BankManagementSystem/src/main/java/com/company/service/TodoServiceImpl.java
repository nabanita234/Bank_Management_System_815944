package com.company.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entities.Todo;
import com.company.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {
	@Autowired
	private TodoRepository todoRepository;

	@Override
	public List<Todo> getTodosByUser(String user) {
		return todoRepository.findByUserName(user);
	}

	@Override
	public Optional<Todo> getTodoById(long id) {
		return todoRepository.findById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		todoRepository.save(todo);
	}

	@Override
	public void addTodo(String name, String panCard,String IFSCcode, Date targetDate,String accountType, String accountNumber, String sendMoney, boolean isDone) {
		todoRepository.save(new Todo(name, panCard,IFSCcode, targetDate,accountType,accountNumber, sendMoney, isDone));
	}

	@Override
	public void deleteTodo(long id) {
		Optional<Todo> todo = todoRepository.findById(id);
		if (todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(Todo todo) {
		todoRepository.save(todo);
	}
	
	@Override
	public Long deleteByUserName(String userName) {
		return todoRepository.deleteByUserName(userName);
	}
}
