package ru.specialist.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.specialist.model.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
