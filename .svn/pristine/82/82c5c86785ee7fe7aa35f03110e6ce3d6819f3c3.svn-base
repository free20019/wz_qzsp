//package test;
//
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.validation.ConstraintViolation;
//import javax.validation.Validation;
//import javax.validation.Validator;
//import javax.validation.ValidatorFactory;
//
//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.validator.Length;
//
//public class User {
//
//	@GeneratedValue(generator = "system-uuid")
//	@GenericGenerator(name = "system-uuid", strategy = "uuid")
//	@Column(length = 32)
//	private String id;
//
//	@Length(min = 1, max = 2)
//	@Column(nullable = false, length = 32, unique = true, updatable = false)
//	private String userName;
//
//	@Column(length = 32)
//	private String age;
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getAge() {
//		return age;
//	}
//
//	public void setAge(String age) {
//		this.age = age;
//	}
//
//	public static void main(String[] args) {
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//		Validator validator = factory.getValidator();
//
//		User user = new User();
//		user.setUserName("");
//		user.setAge("23");
//
//		Set<ConstraintViolation<User>> constraintViolations = validator
//				.validate(user);
//		for (ConstraintViolation<User> constraintViolation : constraintViolations) {
//			System.out.print(constraintViolation.getPropertyPath() + ": ");
//			System.err.println(constraintViolation.getMessage());
//		}
//	}
//
//}