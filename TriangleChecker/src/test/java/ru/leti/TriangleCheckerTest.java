import ru.leti.wise.task.graph.util.FileLoader;
import ru.leti.wise.task.graph.model.Graph;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TriangleCheckerTest {
	@Test
	public void triangleCheckerTest() throws FileNotFoundException {
    	TriangleChecker triangleChecker = new TriangleChecker();
		Graph graph;

		graph = FileLoader.loadGraphFromJson("src/test/resources/3_triangles.json");
    	assertThat(triangleChecker.run(graph)).isTrue();

		graph = FileLoader.loadGraphFromJson("src/test/resources/direct_triangle.json");
    	assertThat(triangleChecker.run(graph)).isFalse();

		graph = FileLoader.loadGraphFromJson("src/test/resources/k5.json");
    	assertThat(triangleChecker.run(graph)).isTrue();

		graph = FileLoader.loadGraphFromJson("src/test/resources/line.json");
    	assertThat(triangleChecker.run(graph)).isFalse();

		graph = FileLoader.loadGraphFromJson("src/test/resources/loop5.json");
    	assertThat(triangleChecker.run(graph)).isFalse();

		graph = FileLoader.loadGraphFromJson("src/test/resources/quad.json");
    	assertThat(triangleChecker.run(graph)).isFalse();

		graph = FileLoader.loadGraphFromJson("src/test/resources/triangle.json");
    	assertThat(triangleChecker.run(graph)).isTrue();

		graph = FileLoader.loadGraphFromJson("src/test/resources/connected_triangles.json");
    	assertThat(triangleChecker.run(graph)).isTrue();
	}
}
