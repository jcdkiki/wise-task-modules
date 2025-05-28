import ru.leti.wise.task.graph.util.FileLoader;
import ru.leti.wise.task.graph.model.Graph;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FindCubeTest {
	@Test
	public void findCubeTest() throws FileNotFoundException {
    	FindCube FindCube = new FindCube();
		Graph graph;

		// graph = FileLoader.loadGraphFromJson("src/test/resources/directed_graph.json");
    	// assertThat(spiderGraphProperty.run(graph)).isFalse();
	}
}
