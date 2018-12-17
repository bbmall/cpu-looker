package pl.malinowski.cpuinfo.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.malinowski.cpuinfo.dto.ProcessDto;
import pl.malinowski.cpuinfo.dto.ProcessMockFactory;
import pl.malinowski.cpuinfo.services.CpuHarvester;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@Primary
@Profile("linux")
class LinuxCpuHarvester implements CpuHarvester {

    @Override
    public Set<ProcessDto> collectData() {
        return Collections.emptySet();
    }

}
