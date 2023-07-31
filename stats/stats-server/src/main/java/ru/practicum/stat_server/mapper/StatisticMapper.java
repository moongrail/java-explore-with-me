package ru.practicum.stat_server.mapper;

import lombok.experimental.UtilityClass;
import ru.practicum.stat_dto.EndpointHitDto;
import ru.practicum.stat_dto.ViewStatsDto;
import ru.practicum.stat_server.model.Statistic;

@UtilityClass
public class StatisticMapper {
    public static ViewStatsDto toResponseView(String app, String uri, Long hits) {
        return ViewStatsDto.builder()
                .app(app)
                .uri(uri)
                .hits(hits)
                .build();
    }

    public static Statistic fromEndpointHitDto(EndpointHitDto endpointHitDto) {
        return Statistic.builder()
                .app(endpointHitDto.getApp())
                .uri(endpointHitDto.getUri())
                .ip(endpointHitDto.getIp())
                .created(endpointHitDto.getTimestamp())
                .build();
    }

    public static EndpointHitDto toEndpointHitDto(Statistic statistic) {
        return EndpointHitDto.builder()
                .app(statistic.getApp())
                .uri(statistic.getUri())
                .ip(statistic.getIp())
                .timestamp(statistic.getCreated())
                .build();
    }
}
