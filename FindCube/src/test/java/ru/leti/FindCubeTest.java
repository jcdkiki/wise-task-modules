import ru.leti.wise.task.graph.util.FileLoader;
import ru.leti.wise.task.graph.model.Graph;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FindCubeTest {
	@Test
	public void findCubeTest() throws FileNotFoundException {
    	FindCube findCube = new FindCube();
		Graph graph;

		graph = FileLoader.loadGraphFromJson("src/test/resources/complete_graph.json");
    	assertThat(findCube.run(graph)).isFalse();

		graph = FileLoader.loadGraphFromJson("src/test/resources/cube_extra_edge.json");
    	assertThat(findCube.run(graph)).isFalse();

		graph = FileLoader.loadGraphFromJson("src/test/resources/cube_plus_isolated.json");
    	assertThat(findCube.run(graph)).isTrue();

		graph = FileLoader.loadGraphFromJson("src/test/resources/cycle_8.json");
    	assertThat(findCube.run(graph)).isFalse();

		graph = FileLoader.loadGraphFromJson("src/test/resources/incomplete_cube.json");
    	assertThat(findCube.run(graph)).isFalse();

		graph = FileLoader.loadGraphFromJson("src/test/resources/perfect_cube.json");
    	assertThat(findCube.run(graph)).isTrue();

		graph = FileLoader.loadGraphFromJson("src/test/resources/small_graph.json");
    	assertThat(findCube.run(graph)).isFalse();

		graph = FileLoader.loadGraphFromJson("src/test/resources/two_cubes.json");
    	assertThat(findCube.run(graph)).isTrue();
	}
}
