CREATE TABLE page_sections (
    "id" UUID PRIMARY KEY,
    "pageId" UUID NOT NULL,
    "type" VARCHAR(50) NOT NULL,
    "theme" VARCHAR(50) NOT NULL DEFAULT 'cream',
    "source" VARCHAR(100),
    "sortOrder" INTEGER NOT NULL DEFAULT 0,
    "kicker" VARCHAR,
    "title" VARCHAR,
    "body" VARCHAR,
    "image" VARCHAR(1000),
    "imageAlt" VARCHAR,
    "buttonLabel" VARCHAR(255),
    "buttonHref" VARCHAR(1000),
    "quote" VARCHAR,
    "attribution" VARCHAR(255),
    "template" VARCHAR,
    "columns" INTEGER,
    "deletedAt" TIMESTAMP,
    "createdAt" TIMESTAMP DEFAULT NOW(),
    "updatedAt" TIMESTAMP DEFAULT NOW(),
    CONSTRAINT "fk_page_sections_pageId" FOREIGN KEY ("pageId") REFERENCES "pages" ("id")
);
CREATE INDEX "idx_page_sections_pageId" ON page_sections ("pageId", "sortOrder");
